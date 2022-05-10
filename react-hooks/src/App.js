import logo from './logo.svg';
import './App.css';
import {Count} from './Count'
import {Welcome} from "./Welcome";
import {Stopwatch} from "./Stopwatch";

function App() {
  return (
    <div className="App">
      <Stopwatch />
      <Count/>
      <Welcome/>
    </div>
  );
}

export default App;
