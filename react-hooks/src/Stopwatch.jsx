import {useEffect, useState} from "react";

export const Stopwatch = () => {
  const [timer, setTimer] = useState(0);
  const [runningState, setRunningState] = useState(false);

  useEffect( () => {
            console.log(runningState);
            let interval;
            if(runningState) {
               interval = setInterval( () => {
                   setTimer((timer) => timer + 1000);
                   console.log(timer);
               }, 1000);
            } else clearInterval(interval);
            return () => clearInterval(interval);
      }, [runningState]
  );

  return (
      <div>
          <p>

        {("0" + Math.floor((timer / 60000) % 60)).slice(-2)}:{("0" + Math.floor((timer / 1000) % 60)).slice(-2)}
      </p>
          <br/>
          <button onClick={() => {
              setRunningState(true);
              setTimer(0);
          }}>Start</button>
          <br/>
          <button onClick={() => setRunningState(false)}>Stop</button>
          <br/>
          <button onClick={() => {
              setRunningState(false);
              setTimer(0);
          }}>Reset</button>
          <br/>
      </div>
  )
};