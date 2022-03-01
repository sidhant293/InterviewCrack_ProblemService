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

-- ############################ ARRAYS ####################################
insert into problems (problem_id,problem_name,problem_difficulty) values (1,'sort-array-of-0s-1s-2s','easy');
insert into problem_tags(problem_id,tag_id) values (1,1);
insert into problem_tags(problem_id,tag_id) values (1,5);

insert into problems (problem_id,problem_name,problem_difficulty) values (2,'move-negative-elements','easy');
insert into problem_tags(problem_id,tag_id) values (2,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (3,'union-and-intersection-of-two-sorted-arrays','easy');
insert into problem_tags(problem_id,tag_id) values (3,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (4,'rotate-array-k-times','medium');
insert into problem_tags(problem_id,tag_id) values (4,1);
-- ---------------
insert into problems (problem_id,problem_name,problem_difficulty) values (5,'largest-sum-contiguous-subarray','easy');
insert into problem_tags(problem_id,tag_id) values (5,1);
insert into problem_tags(problem_id,tag_id) values (5,18);

insert into problems (problem_id,problem_name,problem_difficulty) values (6,'minimum-jumps-to-reach-end','medium');
insert into problem_tags(problem_id,tag_id) values (6,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (7,'first-missing-positive-number','hard');
insert into problem_tags(problem_id,tag_id) values (7,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (8,'duplicate-integer-in-array','medium');
insert into problem_tags(problem_id,tag_id) values (8,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (9,'merge-two-sorted-arrays','hard');
insert into problem_tags(problem_id,tag_id) values (9,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (10,'merge-intervals','medium');
insert into problem_tags(problem_id,tag_id) values (10,1);
insert into problem_tags(problem_id,tag_id) values (10,5);

insert into problems (problem_id,problem_name,problem_difficulty) values (11,'next-permutation','medium');
insert into problem_tags(problem_id,tag_id) values (11,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (12,'count-inversion','medium');
insert into problem_tags(problem_id,tag_id) values (12,1);
insert into problem_tags(problem_id,tag_id) values (12,5);

insert into problems (problem_id,problem_name,problem_difficulty) values (13,'best-time-to-buy-and-sell-stock','easy');
insert into problem_tags(problem_id,tag_id) values (13,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (14,'pair-sum','easy');
insert into problem_tags(problem_id,tag_id) values (14,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (15,'common-elements-in-three-sorted-arrays','medium');
insert into problem_tags(problem_id,tag_id) values (15,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (16,'rearrange-alternating-array','medium');
insert into problem_tags(problem_id,tag_id) values (16,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (17,'subarray-sum-zero','medium');
insert into problem_tags(problem_id,tag_id) values (17,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (18,'maximum-product-subarray','medium');
insert into problem_tags(problem_id,tag_id) values (18,1);
insert into problem_tags(problem_id,tag_id) values (18,18);

insert into problems (problem_id,problem_name,problem_difficulty) values (19,'longest-coinsecutive-subsequence','medium');
insert into problem_tags(problem_id,tag_id) values (19,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (20,'array-subset','easy');
insert into problem_tags(problem_id,tag_id) values (20,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (21,'triplet-sum','medium');
insert into problem_tags(problem_id,tag_id) values (21,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (22,'trapping-rain-water','medium');
insert into problem_tags(problem_id,tag_id) values (22,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (23,'chocolate-distribution','easy');
insert into problem_tags(problem_id,tag_id) values (23,1);
insert into problem_tags(problem_id,tag_id) values (23,5);

insert into problems (problem_id,problem_name,problem_difficulty) values (24,'subarrays-divisible-by-k','medium');
insert into problem_tags(problem_id,tag_id) values (24,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (25,'three-way-partitioning','easy');
insert into problem_tags(problem_id,tag_id) values (25,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (26,'shuffle-array','medium');
insert into problem_tags(problem_id,tag_id) values (26,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (27,'minimum-swaps-required-bring-elements-less-than-equal-k-together','medium');
insert into problem_tags(problem_id,tag_id) values (27,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (28,'median-of-two-sorted-arrays','hard');
insert into problem_tags(problem_id,tag_id) values (28,1);
insert into problem_tags(problem_id,tag_id) values (28,4);

insert into problems (problem_id,problem_name,problem_difficulty) values (29,'subarray-product-less-than-k','medium');
insert into problem_tags(problem_id,tag_id) values (29,1);

insert into problems (problem_id,problem_name,problem_difficulty) values (30,'insert-delete-get-random-o(1)','medium');
insert into problem_tags(problem_id,tag_id) values (30,1);
