delete
from user_role;
delete
from usr;

insert into usr(id, active, password, username)
values (1, true, '$2a$08$A3vEmgx49ip.bvRRxJB6KOv39kHsr5yctp71P3jok.IaRpCGd6qDK', 'admin'),
       (2, true, '$2a$08$A3vEmgx49ip.bvRRxJB6KOv39kHsr5yctp71P3jok.IaRpCGd6qDK', 'son');

insert into user_role(user_id, roles)
values (1, 'USER'),
       (1, 'ADMIN'),
       (2, 'USER');

