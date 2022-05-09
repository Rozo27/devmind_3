import React from "react";
import "./App.css";
import LogoComponent from "./LogoComponent";
import {Badge} from "./Badge";

const badges = [
    {
        firstName: "Johhny",
        lastName: "Depp",
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIMJf32XCdIMPR005aLZbkk5TldBubjW2CfA&usqp=CAU",
        birthday: "10-10-1950",
        description: "I am an actor in the USA",
        hobbies: ["Dance", "Theater", "Movies"]
    },
    {
        firstName: "Tommy",
        lastName: "Williams",
        img: "https://thumbs.dreamstime.com/b/default-avatar-photo-placeholder-profile-icon-eps-file-easy-to-edit-default-avatar-photo-placeholder-profile-icon-124557887.jpg",
        birthday: "27-11-2000",
        description: "I am a Java dev",
        hobbies: ["Java", "React", "Programming"]
    },
    {
        firstName: "Tommy2",
        lastName: "Williams2",
        img: "https://thumbs.dreamstime.com/b/default-avatar-photo-placeholder-profile-icon-eps-file-easy-to-edit-default-avatar-photo-placeholder-profile-icon-124557887.jpg",
        birthday: "02-08-1989",
        description: "I am an engineer",
        hobbies: ["Civil Engineering", "Buildings", "React"]
    }
];

class App extends React.Component {
  constructor() {
    super();
    this.state = {
      counterValue: 0,
    };
  }

  render() {
    const counterValueText = "First counter value " + this.state.counterValue;
    return (
        <div id="container">
          <LogoComponent/>
          <div>
            <button
                onClick={(event) => {
                  this.setState((state, props) => {
                    return {
                      counterValue: state.counterValue - 1,
                    };
                  });
                }}
            >
              -
            </button>
            <span>{counterValueText}</span>
            <button
                onClick={(event) => {
                  this.setState((state, props) => {
                    return {
                      counterValue: state.counterValue + 1,
                    };
                  });
                }}
            >
              +
            </button>
          </div>
          <button
              onClick={(event) => {
                this.setState({ counterValue: 0 });
              }}
          >
            Reset counter
          </button>
          <br/>
          <br/>
            {badges.map(e => (
                <Badge
                    firstName= {e.firstName}
                    lastName={e.lastName}
                    avatarImage={e.img}
                    birthday = {e.birthday}
                    description = {e.description}
                    hobbies = {e.hobbies}
                />
            ))}
        </div>
    );
  }
}

export default App;
