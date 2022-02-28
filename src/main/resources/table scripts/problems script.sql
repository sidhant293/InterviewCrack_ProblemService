CREATE TABLE problems(
    problem_id SERIAL PRIMARY KEY,
    problem_name VARCHAR(50) NOT NULL UNIQUE,
    problem_difficulty VARCHAR(10) NOT NULL
);

alter table problems add constraint difficulty_enum_check check (difficulty='easy' or difficulty='medium' or difficulty='hard');

CREATE TABLE problem_tags(
	problem_id int,
	tag_id int,
	PRIMARY KEY (problem_id,tag_id),
	CONSTRAINT fk_problem
		FOREIGN KEY(problem_id)
			REFERENCES problems(problem_id),
	CONSTRAINT fk_tag
		FOREIGN KEY(tag_id)
			REFERENCES tags(tag_id)
);


insert into problems (problem_id,problem_name,problem_difficulty) values (1,'sort-array-of-0s-1s-2s','easy');
insert into problem_tags(problem_id,tag_id) values (1,5);
insert into problem_tags(problem_id,tag_id) values (1,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (2,'move-negative-elements','easy');
insert into problem_tags(problem_id,tag_id) values (2,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (3,'union-and-intersection-of-two-sorted-arrays','easy');
insert into problem_tags(problem_id,tag_id) values (3,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (4,'rotate-array-k-times','medium');
insert into problem_tags(problem_id,tag_id) values (4,1);
-- ---------------
insert into problems (problem_id,problem_name,problem_difficulty) values (4,'largest-sum-contiguous-subarray','easy');
insert into problem_tags(problem_id,tag_id) values (4,1);
insert into problem_tags(problem_id,tag_id) values (4,18);
