# DataCup💦
WIP: I don't actually know Java.

A partial Java / Springboot port of [DataPond](https://github.com/applehat/datapond)

### Why?
Done as a chance to learn something new, and double down on a bad idea.

# Endpoints🔌

## [GET] `/documents`
Request documents from the DataCup.

|Param|Example|Description|
|---|---|---|
|type|`item`|The type of document to request. Defaults to `item`|
|page|`1`|The page of items you want.|
|perPage|`10`|The number of items you want per page. Defaults to `10`. Only works if page is explicitly set.|

## [GET] `/documents/{id}`
Request a single document by id

## [POST] `/documents`

Create a new document in the DataCup.

Expects `x-www-form-urlencoded` data.

Requires that a `_type` property be given. Created its own `_id` property, and will ignore any `_id` passed to it.

## [PATCH] `/documents/:id`

Update an existing document in the DataCup

Based on `id` passed in URL, will update the document with anything passed in the body.
Expects `x-www-form-urlencoded` data.

Note: Does not allow `_type` or `_id` to be mutated.

## [DELETE] `/documents/:id`
Delete a document from the DataCup by id

Will delete the document with the given `id` if it exists.

# Notes📃
Even the original project I said not to use.

Really don't use this one.