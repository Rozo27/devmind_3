export const Bio = (props) => {
  const checkedHobbies = ["React", "Java"];
  return(
      <div>
          <h4>{'I was born on the ' + props.birthday }</h4>
          <p>{'This is my description:' + props.description}</p>
          <p>{'My hobbies are:' + props.hobbies}</p>
          <p>{'PROGRAMMER:' + props.hobbies.some(el => checkedHobbies.includes(el))}
          </p>
      </div>
  );
};