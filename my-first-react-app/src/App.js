import logo from './devmindLogo.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} alt="logo" />
        <p>
            Welcome! This is my first React app!
        </p>
        <a
          className="App-link"
          href="https://www.devmind.ro/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn Java Frameworks
        </a>
      </header>
    </div>
  );
}

export default App;
