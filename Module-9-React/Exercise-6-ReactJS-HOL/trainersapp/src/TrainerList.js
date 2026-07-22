import { Link } from "react-router-dom";
import trainers from "./TrainersMock";

function TrainerList() {
  return (
    <div style={{ padding: "20px" }}>
      <h2>Trainer List</h2>

      <ul>
        {trainers.map((trainer) => (
          <li key={trainer.trainerId}>
            <Link to={`/trainers/${trainer.trainerId}`}>
              {trainer.name}
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerList;