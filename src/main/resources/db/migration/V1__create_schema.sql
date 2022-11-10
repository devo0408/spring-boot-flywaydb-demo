
create table rooms (
    id int not null AUTO_INCREMENT,
    uuid varchar(36) not null,
    name varchar(255) not null,

    PRIMARY KEY (id),
    CONSTRAINT unique_uuid UNIQUE (uuid)
);

create table bookings (
    id int not null AUTO_INCREMENT,
    room_id int not null,
    started_at TIMESTAMP not null,
    finished_at TIMESTAMP not null,

    PRIMARY KEY (id),
    CONSTRAINT fk_room FOREIGN KEY (room_id) REFERENCES rooms(id)
);
