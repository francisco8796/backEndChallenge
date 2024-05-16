db.createCollection("movies");

db.movies.insertMany([
  {
    title: "The GodFather",
    date: new Date("1972-03-14"),
    rank: 9.2,
    revenue: 20000000,
  },
  {
    title: "The Shawshank Redemption",
    date: new Date("1994-09-10"),
    rank: 9.3,
    revenue: 73000000,
  },
  {
    title: "The Godfather Part II",
    date: new Date("1974-12-12"),
    rank: 9,
    revenue: 93000000,
  },
  {
    title: "Inception",
    date: new Date("2010-07-08"),
    rank: 8.8,
    revenue: 8370000000,
  },
  {
    title: "Fight Club",
    date: new Date("1999-09-10"),
    rank: 8.8,
    revenue: 10000000,
  },
  {
    title: "The Dark Knight",
    date: new Date("2008-07-14"),
    rank: 9,
    revenue: 100000000,
  },
  {
    title: "12 Angry Men",
    date: new Date("1975-04-10"),
    rank: 9,
    revenue: 50000000,
  },
  {
    title: "The Lord of the Rings: The Fellowship of the Ring",
    date: new Date("2001-12-10"),
    rank: 8.9,
    revenue: 80000000,
  },
  {
    title: "The Matrix",
    date: new Date("1999-04-24"),
    rank: 8.7,
    revenue: 50000000,
  },
  {
    title: "Se7en",
    date: new Date("1995-09-15"),
    rank: 8.6,
    revenue: 40000000,
  },
]);
