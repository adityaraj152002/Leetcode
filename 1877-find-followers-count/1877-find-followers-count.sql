SELECT user_id,count(DISTINCT follower_id) as followers_count FROM
Followers GROUP BY
user_id ORDER BY user_id;