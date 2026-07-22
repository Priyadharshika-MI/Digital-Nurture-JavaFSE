import ListofPlayers from "./ListofPlayers";
import {
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
  ListofIndianPlayers,
  IndianTeam
} from "./IndianPlayers";

function App() {

  const flag = true;

  if (flag) {
    return (
      <div style={{ padding: "20px" }}>
        <ListofPlayers />
      </div>
    );
  } else {
    return (
      <div style={{ padding: "20px" }}>
        <h1>Indian Team</h1>

        <h2>Odd Players</h2>
        {OddPlayers(IndianTeam)}

        <hr />

        <h2>Even Players</h2>
        {EvenPlayers(IndianTeam)}

        <hr />

        <h2>List of Indian Players Merged</h2>

        <ListofIndianPlayers IndianPlayers={IndianPlayers} />
      </div>
    );
  }
}

export default App;