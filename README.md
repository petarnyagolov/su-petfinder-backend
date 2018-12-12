# su-petfinder-backend
course project
API Methods
breed.list
Returns a list of breeds for a particular animal.

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
animal	string	required	type of animal (barnyard, bird, cat, dog, horse, reptile, smallfurry)
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderBreedList

| Back to Top |

pet.get
Returns a record for a single pet.

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
id	integer	required	pet ID
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderPetRecord

| Back to Top |

pet.getRandom
Returns a record for a randomly selected pet. You can choose the characteristics of the pet you want returned using the various arguments to this method.

This method can return pet records in three formats:

id: just the pet ID
basic: essential information like name, animal, breed, shelter ID, primary photo
full: the complete pet record
ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
animal	string	optional	type of animal (barnyard, bird, cat, dog, horse, reptile, smallfurry)
breed	string	optional	breed of animal (use breeds.list for a list of valid breeds)
size	string	optional	size of animal (S=small, M=medium, L=large, XL=extra-large)
sex	character	optional	M=male, F=female
location	string	optional	the ZIP/postal code or city and state the animal should be located (NOTE: the closest possible animal will be selected)
shelterid	string	optional	ID of the shelter that posted the pet
output	string	optional (default=id)	How much of the pet record to return: id, basic, full
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderPetRecord

| Back to Top |

pet.find
Searches for pets according to the criteria you provde and returns a collection of pet records matching your search. The results will contain at most count records per query, and a lastOffset tag. To retrieve the next result set, use the lastOffset value as the offset to the next pet.find call.

NOTE: the total number of records you are allowed to request may vary depending on the type of developer key you have.

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
animal	string	optional	type of animal (barnyard, bird, cat, dog, horse, reptile, smallfurry)
breed	string	optional	breed of animal (use breed.list for a list of valid breeds)
size	string	optional	size of animal (S=small, M=medium, L=large, XL=extra-large)
sex	character	optional	M=male, F=female
location	string	required	the ZIP/postal code or city and state where the search should begin
age	string	optional	age of the animal (Baby, Young, Adult, Senior)
offset	string	optional	set this to the value of lastOffset returned by a previous call to pet.find, and it will retrieve the next result set
count	integer	optional	how many records to return for this particular API call (default is 25)
output	string	optional (default=basic)	How much of each record to return: basic (no description) or full (includes description)
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderPetRecordList

| Back to Top |

shelter.find
Returns a collection of shelter records matching your search criteria.

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
location	string	required	the ZIP/postal code or city and state where the search should begin
name	string	optional if location is specified	full or partial shelter name
offset	integer	optional	offset into the result set (default is 0)
count	integer	optional	how many records to return for this particular API call (default is 25)
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderShelterRecordList

| Back to Top |

shelter.get
Returns a record for a single shelter.

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
id	string	required	shelter ID (e.g. NJ94)
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderShelterRecord

| Back to Top |

shelter.getPets
Returns a list of IDs or collection of pet records for an individual shelter

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
id	string	required	shelter ID (e.g. NJ94)
status	character	optional (default=A, public may only list adoptable pets)	A=adoptable, H=hold, P=pending, X=adopted/removed
offset	integer	optional	offset into the result set (default is 0)
count	integer	optional	how many records to return for this particular API call (default is 25)
output	string	optional (default=basic)	How much of the pet record to return: id, basic (no description), full
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderPetRecordList

| Back to Top |

shelter.listByBreed
Returns a list of shelter IDs listing animals of a particular breed.

ARGUMENTS
Name	Type	Required?	Description
key	string	required	your developer key
animal	string	required	type of animal (barnyard, bird, cat, dog, horse, reptile, smallfurry)
breed	string	required	breed of animal(use breed.list for a list of valid breeds)
offset	integer	optional	offset into the result set (default is 0)
count	integer	optional	how many records to return for this particular API call (default is 25)
format	string	optional (default=xml)	Response format: xml, json
XML return type: petfinderShelterRecordList
