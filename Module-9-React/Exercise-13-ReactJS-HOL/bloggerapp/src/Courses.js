import { courses } from "./Data";

function Courses() {
  return (
    <div>
      {courses.map((course) => (
        <div key={course.id}>
          <p><b>Course:</b> {course.cname}</p>
          <p><b>Duration:</b> {course.duration}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default Courses;