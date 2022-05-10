import {useEffect, useState} from "react";

export const Count = (effect, deps) => {
    const [counter, setCounter] = useState(0);

    useEffect(
        () => {
            console.log('first mount');
        }, [counter]
    );
    return (
        <div>
            <button
                onClick={() => setCounter(counter - 1)}
            >
                -
            </button>
            <span>{`The counter's value is: ${counter}`}</span>
            <button
                onClick={() => setCounter(counter + 1)}
            >
                +
            </button>
        </div>
    );
};