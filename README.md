# Property Hunt:
Build a console application for a Property Management Business where you can expose features
like register a user, list a property and search properties based on your requirements etc.

Functional Requirement:
1. Register a User: One time registration of the user.
2. List a Property: Users can list the properties they want to sell.
3. View Listed Properties: Users can view properties listed by them.
4. Shortlist a Property: Users can shortlist properties they are interested in.
5. View Shortlisted Properties: Users can list properties they have shortlisted (including sold
   but the status should be "SOLD").
6. Search Properties: Users can search for listed properties(only available properties should
   appear in results). They can use a combination of:
   a. Location (case insensitive exact match would suffice to search).
   b. Price Range.
   c. Listing Type: Sell/Rent.
   d. Size Range.
   e. The number of rooms: 1BHK, 2BHK, 3BHK.
   f. Sort by: It could be price or size(only ascending order is required).
   g. Users can choose any set of parameters above for search.
6. Mark Sold: Users can mark a property as SOLD which was listed by them.

Non-Functional Requirements:
1. Accept size in multiple units (sq. meter, sq.ft & sq.yard). A seller and buyer can provide the
   size of different units while listing and searching properties.
2. Accept a number of locations as nearby locations for a property listing and search should list
   properties with search locations in nearby places also(here sort by location can also be
   provided and such properties which are a match in nearby locations, should appear last).
3. Accept price in multiple forms (40000, 40k, 2Cr, 60L, etc.) during the listing for searching.
4. For location and number of rooms, accept "," separated values during the search.
