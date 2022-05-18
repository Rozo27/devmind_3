import {Paper, Table, TableBody, TableCell, TableContainer, TableHead, TableRow} from "@mui/material";

const ReposComponent = ({repoInfo}) => {
    console.log(repoInfo);
    return (
        <div>
            <TableContainer element={Paper}>
                <Table sx={{ minWidth: 650}} aria-label="simple table">
                    <TableHead>
                        <TableRow sx={{
                            justifyContent:"center",
                            alignItems:"center",
                            width: 400
                        }}>
                            <TableCell>Name</TableCell>
                            <TableCell>Owner</TableCell>
                            <TableCell>Link</TableCell>
                            <TableCell>Description</TableCell>
                            <TableCell>Default Branch</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {repoInfo.map((repo) => {
                            return (
                                <TableRow sx={{
                                    justifyContent:"center",
                                    alignItems:"center",
                                    width: 400
                                }} key={repo.id}>
                                    <TableCell>{repo.name}</TableCell>
                                    <TableCell>{repo.owner.login}</TableCell>
                                    <TableCell>{repo.html_url}</TableCell>
                                    <TableCell>{repo.description}</TableCell>
                                    <TableCell>{repo.default_branch}</TableCell>
                                </TableRow>
                            );
                        })}
                    </TableBody>
                </Table>
            </TableContainer>
        </div>
    );
}

export default ReposComponent;