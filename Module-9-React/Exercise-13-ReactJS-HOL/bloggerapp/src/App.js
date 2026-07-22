import "./App.css";
import Books from "./Books";
import Blogs from "./Blogs";
import Courses from "./Courses";

function App() {

  const showComponents = true;

  return (
    <div className="container">

      {showComponents ? (
        <>
          <div className="section">
            <h2>Book Details</h2>
            <Books />
          </div>

          <div className="section">
            <h2>Blog Details</h2>
            <Blogs />
          </div>

          <div className="section">
            <h2>Course Details</h2>
            <Courses />
          </div>
        </>
      ) : (
        <h2>No Data Available</h2>
      )}

    </div>
  );
}

export default App;