import { blogs } from "./Data";

function Blogs() {
  return (
    <div>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <p><b>Title:</b> {blog.title}</p>
          <p><b>Author:</b> {blog.author}</p>
          <p>{blog.content}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default Blogs;