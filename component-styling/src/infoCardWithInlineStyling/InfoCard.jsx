import React from "react";

const InfoCard = (props) => {
    const description = props.description;
    const image = props.image;
    const question = props.question;
    const separatorClass = props.separatorClass;

    const cardContainerStyle = {
        display: "flex",
        flexDirection: "column",
        border: " 1px solid #ececec",
        borderRadius: "5px",
        justifyContent: "center",
        alignItems: "center",
        paddingLeft: "8px",
        paddingRight: "8px",
        paddingTop: "8px",
        paddingBottom: "8px",
        margin: "16px"
    };
    //
    // let separatorColor = "red";
    // if (separatorClass === "orange") {
    //     separatorColor = "orange";
    // } else if (separatorClass === "blue") {
    //     separatorColor = "#0097A7";
    // }

    return (
        <div style={cardContainerStyle}>
            <img src={image}></img>
            <span style={{
                    marginTop: "24px",
                    color: "#000",
                    fontWeight: "bold",
                    fontSize: "24px",
                }}>{question}</span>
            <div style={{
                width: "32px",
                height: "4px",
                marginTop: "4px",
                marginBottom: "8px",
                backgroundColor: separatorClass,
            }}/>
            <span style={{ color: "rgba(0, 0, 0, 0.68)" }}>{description}</span>
        </div>
    );
}

export default InfoCard;