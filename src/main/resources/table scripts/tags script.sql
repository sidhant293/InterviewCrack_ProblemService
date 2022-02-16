CREATE TABLE tags(
    tag_id SERIAL PRIMARY KEY,
    tag_name VARCHAR(20) NOT NULL UNIQUE
);

insert into tags(tag_id,tag_name) values (1,'array');
insert into tags(tag_id,tag_name) values (2,'matrix');
insert into tags(tag_id,tag_name) values (3,'string');
insert into tags(tag_id,tag_name) values (4,'searching');
insert into tags(tag_id,tag_name) values (5,'sorting');
insert into tags(tag_id,tag_name) values (6,'math');
insert into tags(tag_id,tag_name) values (7,'linked-list');
insert into tags(tag_id,tag_name) values (8,'binary-tree');
insert into tags(tag_id,tag_name) values (9,'binary-search-tree');
insert into tags(tag_id,tag_name) values (10,'greedy');
insert into tags(tag_id,tag_name) values (11,'backtracking');
insert into tags(tag_id,tag_name) values (12,'stack');
insert into tags(tag_id,tag_name) values (13,'queue');
insert into tags(tag_id,tag_name) values (14,'heap');
insert into tags(tag_id,tag_name) values (15,'trie');
insert into tags(tag_id,tag_name) values (16,'graph');
insert into tags(tag_id,tag_name) values (17,'bit-manipulation');
insert into tags(tag_id,tag_name) values (18,'dynamic-programming');
