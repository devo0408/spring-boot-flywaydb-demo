
-- Room 1 setup
insert into rooms (uuid, name) values (random_uuid(), 'Room 1');
insert into bookings (room_id, started_at, finished_at) values (1, parseDateTime('01/01/2022 00:00:00', 'MM/dd/yyyy HH:mm:ss'),parsedatetime('01/31/2022 23:59:59', 'MM/dd/yyyy HH:mm:ss'));
insert into bookings (room_id, started_at, finished_at) values (1, parseDateTime('03/01/2022 00:00:00', 'MM/dd/yyyy HH:mm:ss'),parsedatetime('03/31/2022 23:59:59', 'MM/dd/yyyy HH:mm:ss'));

-- Room 2 setup
insert into rooms (uuid, name) values (random_uuid(), 'Room 2');
insert into bookings (room_id, started_at, finished_at) values (1, parseDateTime('02/01/2022 00:00:00', 'MM/dd/yyyy HH:mm:ss'),parsedatetime('02/28/2022 23:59:59', 'MM/dd/yyyy HH:mm:ss'));

-- Room 3 setup
insert into rooms (uuid, name) values (random_uuid(), 'Room 3');