
create table rooms (
    id int not null AUTO_INCREMENT,
    uuid varchar(36) not null,
    name varchar(255) not null,

    PRIMARY KEY (id),
    CONSTRAINT unique_uuid UNIQUE (uuid)
);

create table bookings (
    id int not null AUTO_INCREMENT,
    uuid varchar(36) not null,
    room_id int not null,
    start_date DATE not null,
    end_date DATE not null,

    PRIMARY KEY (id),
    CONSTRAINT fk_room FOREIGN KEY (room_id) REFERENCES rooms(id),
    CONSTRAINT check_dates CHECK (start_date < end_date)
);
