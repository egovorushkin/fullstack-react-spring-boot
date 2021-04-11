import "./App.css";
import { getAllStudents } from "./client";

function App() {
  const res = await getAllStudents();
  const students = await res.json();
  console.log(students);
}

export default App;
