db.zipcodes.find({city : "ATLANTA"},{state : "GA"});
db.zipcodes.aggregate([{$match: {city:"ATLANTA",state:"GA"}}]);
db.zipcodes.aggregate([  {$match: {city:"ATLANTA"}},{$group: {_id: "$loc"}},{$count: "loc"}])
db.zipcodes.aggregate([  {$match: {city:"ATLANTA"}},{$group: {_id: "$city", totalpop: {$sum: "$pop"}}},])

db.zipcodes.aggregate([  {$group: {_id: "$state", totalpop: {$sum: "$pop"}}},])
db.zipcodes.aggregate([  {$group: {_id: "$state", totalpop: {$sum: "$pop"}}},{$sort: {totalpop: -1}}])
db.zipcodes.aggregate([  {$group: {_id: "$state", totalpop: {$sum: "$pop"}}},{$sort: {totalpop: -1}},{$limit : 3}])

db.zipcodes.aggregate([  {$group: {_id:{state:"$state" , city:"$city"}, totalpop: {$sum: "$pop"}}}])
db.zipcodes.aggregate([  {$group: {_id:{state:"$state" , city:"$city"}, totalpop: {$sum: "$pop"}}},{$sort: {totalpop: -1}}])
db.zipcodes.aggregate([  {$group: {_id:{state:"$state" , city:"$city"}, totalpop: {$sum: "$pop"}}},{$sort: {totalpop: -1}},{$limit: 3}])
db.zipcodes.aggregate([  {$group: {_id:{state:"$state" , city:"Texas"}, totalpop: {$sum: "$pop"}}},{$sort: {totalpop: -1}},{$limit: 3}])



