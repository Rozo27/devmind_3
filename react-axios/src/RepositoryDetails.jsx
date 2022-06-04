import {useNavigate, useParams} from "react-router-dom";
import {MenuItem, Select, TableCell} from "@mui/material";
import {useEffect, useState} from "react";
import {getAllReposForUser} from "./ReposApi";

const RepositoryDetails = () => {
    const params = useParams();
    const navigate = useNavigate();
    const [reposInfo, setReposInfo] = useState([]);
    const [repo, setRepo] = useState(undefined);
    const [selectedId, setSelectedId] = useState(params.id);

    useEffect(() => {
        console.log("in useEffect")
        const filterResult = reposInfo.filter(e => {
            return e.id.toString() === params.id;
        })
        setRepo(filterResult.length ? filterResult[0] : undefined)
    }, [params, reposInfo])

    useEffect( () => {
        getAllReposForUser("Rozo27").then(
            (response) => {
                setReposInfo(response.data)
                console.log(response.data)
            }
        );
        console.log(reposInfo);
    }, [])

    const handleChange = (event) => {
        console.log('should navigate to', event)
        navigate(
            `/repos/${event.target.value}`
        )
    };

    return (

        <div>
            {!repo &&
                <p>
                    No such repo found for id: {params.id}
                </p>
            }
            {repo &&
                <div>
                    <h4>Repo name:{repo.name}</h4>
                    <h3>Repo owner:{repo.owner.login}</h3>
                    <h3>HTML URL:{repo.html_url}</h3>
                    <h3>Description:{repo.description}</h3>
                    <h3>Default branch:{repo.default_branch}</h3>
                    <Select
                        labelId="demo-simple-select-label"
                        id="demo-simple-select"
                        value={params.id}
                        label="Repository Id"
                        onChange={handleChange}
                    >
                        {
                            reposInfo.map( r => {
                                return <MenuItem value={r.id}>{r.id}</MenuItem>
                            })
                        }
                    </Select>
                </div>
            }
        </div>
    );
}

export default RepositoryDetails;