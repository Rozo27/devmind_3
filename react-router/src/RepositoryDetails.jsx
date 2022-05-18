import {useNavigate, useParams} from "react-router-dom";
import {MenuItem, Select, TableCell} from "@mui/material";
import {useState} from "react";

const RepositoryDetails = ({repoInfo}) => {
    const params = useParams();
    const navigate = useNavigate();
    const repo = repoInfo.filter( r => r.id == params.id );
    const [selectedId, setSelectedId] = useState('');

    const handleChange = (event) => {
        navigate(
            `/repos/${event.target.value}`
        )
    };

    return (

        <div>
            {console.log(repo)}
            {
                repo.length === 0 &&
                <p>
                    No such repo found for id: {params.id}
                </p>
            }
            {
                repo.length !== 0 &&
                <div>
                    <h4>Repo name:{repo.at(0).name}</h4>
                    <h3>Repo owner:{repo.at(0).owner.login}</h3>
                    <h3>HTML URL:{repo.at(0).html_url}</h3>
                    <h3>Description:{repo.at(0).description}</h3>
                    <h3>Default branch:{repo.at(0).default_branch}</h3>
                    <Select
                        labelId="demo-simple-select-label"
                        id="demo-simple-select"
                        value={selectedId}
                        label="Repository Id"
                        onChange={handleChange}
                    >
                        {
                            repoInfo.map( repo => {
                                return <MenuItem value={repo.id}>{repo.id}</MenuItem>
                            })
                        }
                    </Select>
                </div>
            }
        </div>
    );
}

export default RepositoryDetails;