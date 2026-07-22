import styles from "./CohortDetails.module.css";

function CohortDetails() {
  const cohorts = [
    {
      code: "INTADMDF10 - .NET FSD",
      startedOn: "22-Feb-2022",
      status: "Scheduled",
      coach: "Ashwin",
      trainer: "Jojo Jose",
    },
    {
      code: "ADM21JF014 - Java FSD",
      startedOn: "10-Sep-2021",
      status: "Ongoing",
      coach: "Apoorv",
      trainer: "Bisa Smith",
    },
    {
      code: "CDBJF21025 - Java FSD",
      startedOn: "24-Dec-2021",
      status: "Ongoing",
      coach: "Ashwin",
      trainer: "John Doe",
    },
  ];

  return (
    <div style={{ textAlign: "center" }}>
      {cohorts.map((cohort, index) => (
        <div key={index} className={styles.box}>
          <h3
            style={{
              color: cohort.status === "Ongoing" ? "green" : "blue",
            }}
          >
            {cohort.code}
          </h3>

          <dl>
            <dt>Started On</dt>
            <dd>{cohort.startedOn}</dd>

            <dt>Current Status</dt>
            <dd>{cohort.status}</dd>

            <dt>Coach</dt>
            <dd>{cohort.coach}</dd>

            <dt>Trainer</dt>
            <dd>{cohort.trainer}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
}

export default CohortDetails;