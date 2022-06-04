import {DataGrid} from "@mui/x-data-grid";
import {Box, Button, Modal} from "@mui/material";


const UserModal = (props) => {
    const onClose = props.onClose;
    const postComm = props.modalData.comm;
    const postData = props.modalData.post;

    const tableColumns = [
        {field: "id", headerName: "ID"},
        {field: "postId", headerName: "PostID"},
        {field: "name", headerName: "Name", width: 300},
        {field: "email", headerName: "Email", width: 300},
        {field: "body", headerName: "Body", width: 550},
    ];
    console.log(props)
    return (
        <Modal open onClose={() => onClose(undefined)}>
            <Box
                width="100%"
                height="100%"
                display="flex"
                alignItems="center"
                justifyContent="center"
            >
                <Box
                    position="relative"
                    borderRadius="15px"
                    width="80%"
                    height="600px"
                    bgcolor="beige"
                    display="flex"
                    flexDirection="column"
                    p={3}
                >
                    <Box fontWeight="bold" py={1}>Post comms:</Box>
                    <Box height={"500px"}>
                        <DataGrid rows={postComm} columns={tableColumns}/>
                    </Box>

                    <Button variant="contained" onClick={onClose}>Close Modal</Button>
                </Box>
            </Box>
        </Modal>
    );
}
export default UserModal;