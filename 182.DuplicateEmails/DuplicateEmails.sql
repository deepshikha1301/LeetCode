SELECT distinct p1.email AS Email from Person p1, Person p2
where p1.id<>p2.id AND p1.email=p2.email;