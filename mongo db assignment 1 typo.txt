db.movies.insertMany([{title : "Fight Club", writer : "Chuck Palahniuko", year : "1999", actors : ["Brad Pitt","Edward Norton"]},{title : "Pulp Fiction", writer : "Quentin Tarantino", year : "1994", actors : ["John Travolta","Uma Thurman"]},{title : "Inglorious Basterds", writer : "Quentin Tarantino", year : "2009", actors : ["Brad Pitt","Diane Kruger","Eli Roth"]},{title : "The Hobbit: An Unexpected Journey", writer : "J.R.R. Tolkein", year : "2012", franchise : "The Hobbit"},{title : "The Hobbit: The Desolation of Smaug", writer : "J.R.R. Tolkein", year : "2013", franchise : "The Hobbit"},{title : "The Hobbit: The Battle of the Five Armies", writer : "J.R.R. Tolkein", year : "2012", franchise : "The Hobbit", synopsis: "Bilbo and Company are forced to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness."},{title : "Pee Wee Herman's Big Adventure"},{title : "Avatar"}])
db.movies.find();
db.movies.find({writer : "Quentin Tarantino"});
db.movies.find({actors : "Brad Pitt"});
db.movies.find({franchise : "The Hobbit"});
db.movies.find({year : {$gte:"1990",$lte:"2000"}});
db.movies.find({$or: [{year :{$gt:"2010"}},{year : {$lt:"2000"}}]});
db.movies.update({title : "The Hobbit: An Unexpected Journey" },{$set: { synopsis : "A reluctant hobbit Bilbo Baggins sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug."}});
db.movies.update({title : "The Hobbit: The Desolation of Smaug" },{$set: { synopsis : "The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland , from Smaug.Bilbo Baggins is in possession of a mysterious and magical ring"}});
db.movies.update({title : "Pulp Fiction"},{$set: {actors : "Samuel L. Jackson"}},{ upsert : true});
db.movies.createIndex({synopsis : "text"})
db.movies.find({$text:{$search:"Bilbo"}})

db.movies.find({$text:{$search:"Bilbo" $ne:"Gandalf"}})
db.movies.find({$text:{$search:{$or:["dwarves","hobbit"]}}})
db.movies.find({$text:{$search:{$and:["Bilbo","dwarves"]}}})

db.collection.deleteOne({title : "Pee Wee Hermans Big Adventure"})
db.collection.deleteOne({title : "Avatar"})
db.users.insertMany([{username : "GoodGuyGreg",first_name : "Good Guy", last_name : "Greg"},{username:"ScumbagSteve",full_name:"",first:"Scumbag",last:"Steve"}]);
db.posts.insertMany([{username : "GoodGuyGreg",title : "Passes out at party",body : "Wakes up early and cleans house"},{username : "GoodGuyGreg",title : "Steals your identity",body : "Raises your credit score"},{username : "GoodGuyGreg",title : "Reports a bug in your code",body : "Sends you a Pull Request"},{username : "ScumbagSteve",title : "Borrows something",body : "Sells it"},{username : "ScumbagSteve",title : "Borrows everything",body : "The end"},{username : "ScumbagSteve",title : "Forks your repo on github",body : "Sets to private"}]);
db.comments.insertMany([{username : "GoodGuyGreg",comment : "Hope you got a good deal!",post : "61042f34fa841eb591412abf"},{username : "GoodGuyGreg",comment : "What's mine is yours!",post : "61042f34fa841eb591412ac0"},{username : "GoodGuyGreg",comment : "Don't violate the licensing agreement",post : "61042f34fa841eb591412ac1"},{username : "ScumbagSteve",comment : "It still isn't clean ",post : "61042f34fa841eb591412abc"},{username : "ScumbagSteve",comment : "Denied your PR cause I found a hack ",post : "61042f34fa841eb591412abe"}]);
db.users.find();
db.posts.find();
db.posts.find({username : "GoodGuyGreg"});
db.posts.find({username : "ScumbagSteve"});
db.comments.find();
db.comments.find({username : "GoodGuyGreg"});
db.comments.find({username : "ScumbagSteve"});
db.comments.find({post : "61042f34fa841eb591412abe"});









