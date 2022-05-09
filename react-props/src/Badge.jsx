import {Bio} from "./Bio";
import React from 'react';

export class Badge extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            firstname : props.firstname,
            lastname : props.lastname,
            birthday: props.birthday,
            description: props.description,
            hobbies: props.hobbies,
            avatarImage : props.avatarImage
        };
    }
    render () {
        return (
            <div
                style={{
                    border: "1px solid black",
                    width: "500px",
                    borderRadius: "8px",
                    padding: "8px",
                    display: "flex",
                    height: "200px",
                    margin: "10px"
                }}
            >
                <div style={{ width: "100%" }}>
                    <h4>{this.state.firstname}</h4>
                    <h5>{this.state.lastName}</h5>
                    <Bio
                        birthday = {this.state.birthday}
                        description = {this.state.description}
                        hobbies = {this.state.hobbies}
                    ></Bio>

                </div>
                <img src={this.state.avatarImage} height="64px" />
            </div>
        );

    }
}

// export const Badge = (props) => {
//     return (
//         <div
//             style={{
//                 border: "1px solid black",
//                 width: "500px",
//                 borderRadius: "8px",
//                 padding: "8px",
//                 display: "flex",
//                 height: "250px",
//                 margin: "10px"
//             }}
//         >
//             <div style={{ width: "100%" }}>
//                 <h4>{props.firstName}</h4>
//                 <h5>{props.lastName}</h5>
//                 <Bio
//                     birthday = {props.birthday}
//                     description = {props.description}
//                     hobbies = {props.hobbies}
//                 ></Bio>
//
//             </div>
//             <img src={props.avatarImage} height="64px" />
//         </div>
//     );
// };