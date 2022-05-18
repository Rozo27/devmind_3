import {useNavigate} from "react-router-dom";

const HomeComponent = ({info}) => {
    const navigate = useNavigate();
    return (
        <div
            style={{
                border: "1px solid black",
                width: "500px",
                borderRadius: "8px",
                padding: "8px",
                display: "flex",
                height: "230px",
                margin: "10px"
            }}
        >
            <div style={{ width: "100%"}}>
                {console.log(info)}
                <h4>Username:{info.login}</h4>
                <h5>No.Public Repos:{info.public_repos}</h5>
                <h5>No.Followers:{info.followers}</h5>
                <h5>No.Following:{info.following}</h5>
                <button onClick={() => navigate('/repos')}>Go to repos section</button>
            </div>
            <img src={info.avatar_url} height="64px" />
        </div>
    );

};

export default HomeComponent;