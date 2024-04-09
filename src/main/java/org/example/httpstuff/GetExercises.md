### Exercise 1: Fetch All Users
**Objective:** Retrieve a list of all users from JSONPlaceholder and print their names.
- **Endpoint:** `https://jsonplaceholder.typicode.com/users`
- **Task:** Send a GET request to the endpoint, parse the JSON response to extract the names of all users, and print them.

### Exercise 2: Single User Details
**Objective:** Fetch details for a specific user by ID and print their email address.
- **Endpoint:** `https://jsonplaceholder.typicode.com/users/{id}` (Replace `{id}` with an actual user ID, e.g., 1)
- **Task:** Make a GET request to retrieve data for user with ID 1, parse the JSON response, and print the user's email.

### Exercise 3: User Posts
**Objective:** Retrieve and print the titles of all posts made by a specific user.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts?userId={userId}` (Replace `{userId}` with an actual user ID, e.g., 1)
- **Task:** Fetch all posts for user with ID 1, parse the JSON to extract post titles, and print them.

### Exercise 4: Comments on a Post
**Objective:** Fetch all comments on a specific post and count them.
- **Endpoint:** `https://jsonplaceholder.typicode.com/posts/{postId}/comments` (Replace `{postId}` with an actual post ID, e.g., 1)
- **Task:** Make a GET request to retrieve comments for post with ID 1, parse the JSON response, and print the total number of comments.

### Exercise 5: Todos Completion Status
**Objective:** Fetch all todos for a specific user and print how many of them are completed.
- **Endpoint:** `https://jsonplaceholder.typicode.com/todos?userId={userId}` (Replace `{userId}` with an actual user ID, e.g., 1)
- **Task:** Retrieve todos for user with ID 1, parse the JSON response to determine how many todos are marked as completed, and print this count.

For each exercise, consider the following steps:
1. Use `java.net.http.HttpClient` to create and send HTTP GET requests.
2. Use `java.net.http.HttpRequest` to configure your GET requests.
3. Use `java.net.http.HttpResponse` to handle the responses.
4. Parse the JSON responses.
5. Extract the required information from the parsed JSON and output it as specified in the tasks.
6. Put every exercise in its own method, make the method except parameters for IDs and the like where applicable. 
