
### Exercise 1: Basic GET Request
- **Objective:** Make a simple GET request to retrieve all posts from JSONPlaceholder.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts`
- **Task:** Print the status code of the response to ensure the request was successful.

### Exercise 2: Parse and Display Data
- **Objective:** Parse the JSON response from retrieving all posts and print the title of the first post.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts`
- **Task:** Use any JSON library for parsing.

### Exercise 3: Query Parameters
- **Objective:** Retrieve posts from a specific user using query parameters.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts?userId=1`
- **Task:** Print the number of posts retrieved for `userId=1`.

### Exercise 4: Specific Item Request
- **Objective:** Fetch a specific post by its id.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts/{id}` (replace `{id}` with an actual id, like 1)
- **Task:** Print the entire response body of the post with id 1.

### Exercise 5: Handling HTTP POST Request
- **Objective:** Create a new post using the POST method.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts`
- **Data:** Use a JSON object with title, body, and userId.
- **Task:** Print the response to ensure the new post was created.

### Exercise 6: Updating Data with PUT
- **Objective:** Update a post using the PUT method.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts/{id}`
- **Data:** Modify the title and body of an existing post.
- **Task:** Verify the update by printing the updated resource.

### Exercise 7: Deleting a Resource
- **Objective:** Delete a post.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts/{id}`
- **Task:** Use the DELETE method and print the status code to ensure the resource was deleted.

### Exercise 8: Handling Errors
- **Objective:** Attempt to retrieve a post that doesn't exist to handle errors gracefully.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts/{id}` (use an id that doesn't exist, e.g., 9999)
- **Task:** Print a custom error message if the post is not found.

