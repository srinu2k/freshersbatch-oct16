db.addresses.find()
db.addresses.aggregate([{$project: {borough: 1, cuisine: 1, name : 1, restaurant_id: 1}}])
db.addresses.aggregate([{$project:{cuisine: 1, borough: 1 , name: 1 , restaurant_id: 1,,_id: 0}}])
db.addresses.aggregate([{$project:{cuisine: 1, borough: 1 , name: 1 , restaurant_id: 1,address.zipcode: 1,_id: 0}}])
db.addresses.aggregate([{$match: {borough:"Bronx"}},{$limit: 5}])
db.addresses.aggregate([{$match: {borough:"Bronx"}},])
db.addresses.aggregate([{$match: {borough:"Bronx"}},{$skip : 5},{$limit: 5}])
db.addresses.find({grades : { $elemMatch:{"score":{$gt : 90 }}}});
db.addresses.find({grades : { $elemMatch:{"score":{$gt : 80, $lt : 100 }}}});

db.addresses.find({"address.coord" : {$lt : -95.754168}});
db.addresses.find({$and:[{"cuisine" : {$ne :"American "}},{"grades.score" : {$gt : 70}},{"address.coord" : {$lt : -65.754168}}]});
db.addresses.find({"cuisine" : {$ne : "American "},"grades.score" :{$gt: 70},"address.coord" : {$lt : -65.754168}});
db.addresses.find( {"cuisine" : {$ne : "American "},"grades.grade" :"A","borough": {$ne : "Brooklyn"}} ).sort({"cuisine":-1});
db.addresses.find({name: /^Wil/},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({name: /ces$/},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({name: /ces$/},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({ "borough": "Bronx" , $or : [{ "cuisine" : "American " },{ "cuisine" : "Chinese" }] } );
db.addresses.find({"borough" :{$in :["Staten Island","Queens","Bronx","Brooklyn"]}},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({"borough" :{$nin :["Staten Island","Queens","Bronx","Brooklyn"]}},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({"grades.score" : { $not: {$gt : 10}}},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({$or: [  {name: /^Wil/},   {"$and": [{"cuisine" : {$ne :"American "}}, {"cuisine" : {$ne :"Chinees"}}]}]},{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1});
db.addresses.find({"grades.date": ISODate("2014-08-11T00:00:00Z"), "grades.grade":"A" , "grades.score" : 11}, {"restaurant_id" : 1,"name":1,"grades":1});
db.addresses.find({ "grades.1.date": ISODate("2014-08-11T00:00:00Z"), "grades.1.grade":"A" , "grades.1.score" : 9}, {"restaurant_id" : 1,"name":1,"grades":1});
db.addresses.find({ "address.coord.1": {$gt : 42, $lte : 52}},{"restaurant_id" : 1,"name":1,"address":1,"coord":1} );
db.addresses.find().sort({"name":1});
db.addresses.find().sort({"name":-1});
db.addresses.find().sort({"cuisine":1,"borough" : -1,});
db.addresses.find({"address.street" : { $exists : true } } );
db.addresses.find({"address.coord" : {$type : 1} });
db.addresses.find({"grades.score" :{$mod : [7,0]}}, {"restaurant_id" : 1,"name":1,"grades":1});
db.addresses.find({ name : { $regex : "mon.*", $options: "i" } },{ "name":1,"borough":1,"address.coord":1,"cuisine" :1});
db.addresses.find({ name : { $regex : /^Mad/i, } },{"name":1,"borough":1,"address.coord":1,"cuisine" :1});























