import {useEffect, useState} from "react";

export const Welcome = () => {
    const [message, setMessage] = useState('Please wait...');

    useEffect(() => {
        const timer = setTimeout(() => setMessage('Welcome to Devmind!'), 3000);
        return () => clearTimeout(timer);
    }, []);
    return <p>{message}</p>
}