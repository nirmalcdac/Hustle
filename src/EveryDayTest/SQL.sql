select department, max(salary) as highest_salary from employee group by department

a tennis tournament

with different players

1 player can play multiple Matches

create a schedule

so that score can be updated for each match

matches can be doubles or singles

each player needs to be able to see their past win/loss records


Tennis Tournament

tournament
Id, Tournament_name, start_date, End_date
uuid, T1, 23, 25

player
player_id, player_name
p1, Ram
p1, Shyam

match
match_id, match_id, match_name  match_date_time, match_type(S/D), tournament_id(Foreign_key  Tournament_table), Score(10/20), Winner, looser  tm1 score,
uuid(), m1, Match1 23, Single, T1, 10/20, null, null
uuid(), m1, 23, Match1, Double, T1, 0/10, {p1, p2}
uuid(), m1, 23, Match1, Double, T1, 5/10, {p1, p2}

match_player_mapping
match_player_mapping_id, match_id, Player_id, team,
uuid(),m1, p1 , tm1
uuid(),m1, p2	tm1
uuid(),m1, p3   tm2
uuid(),m1, p4   tm2

uuid(),m2, p1   t1
uuid(),m2, p2   t2


uuid(), m1, (P1, P2, P3, P4)  {p1, p3}, {p2, p4}

matches For percular date,


select m.match_name, m.match_type, gouup_concat(mpm.player_id,",")  from match inner join match as m player_mapping mpm
on m.match_id = mpm.match_id
where m.match_date_time = (date, 'ddmmyyyy');




select m.match_name, m.match_type, group_concat(mpm.player_id,","), m.score, m.winner, m.looser  from match inner join match as m player_mapping mpm
on m.match_id = mpm.match_id
where m.match_date_time = (date, 'ddmmyyyy');

Player History history
Select m.score from match_player_mapping as mpm inner join match  as m
on mpm.match_id = m.match_id
where mpm.player_id = "p1" //and m.winner='p1'






a file with 1 lac rows (menu for 1 lac restaurants)
each row has entire menu for that restaiurance (item name=description=price, item name=description=price ..... format)
read and process each row on daily basis 8 am, 12 noon and 6pm daily, and do save or update (only where needed)
keep a record of items updated in S3
any errors encountered shall be retried
the final menu shall be updated in RDS.
UI will read from RDS












