
-- Room 1 setup
insert into rooms (uuid, name) values (random_uuid(), 'Room 1');
insert into bookings (room_id, uuid, start_date, end_date) values (1, random_uuid(), parseDateTime('01-01-2022', 'MM-dd-yyyy'), parsedatetime('01-31-2022', 'MM-dd-yyyy'));
insert into bookings (room_id, uuid, start_date, end_date) values (1, random_uuid(), parseDateTime('03-01-2022', 'MM-dd-yyyy'), parsedatetime('03-31-2022', 'MM-dd-yyyy'));

-- Room 2 setup
insert into rooms (uuid, name) values (random_uuid(), 'Room 2');
insert into bookings (room_id, uuid, start_date, end_date) values (1, random_uuid(), parseDateTime('02-01-2022', 'MM-dd-yyyy'), parsedatetime('02-28-2022', 'MM-dd-yyyy'));

-- Room 3 setup
insert into rooms (uuid, name) values (random_uuid(), 'Room 3');