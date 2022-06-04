import {useEffect, useState} from "react";
import {getAllPosts, getPostComms, postNewPost} from "./ReposApi";
import {DataGrid} from '@mui/x-data-grid';
import {Alert, Box} from "@mui/material";
import UserModal from "./UserModal";
import Snackbar from '@mui/material/Snackbar';

const PostsComponent = () => {
    const [posts, setPosts] = useState([]);
    const [modalData, setModalData] = useState(undefined);
    const [newPost, setNewPost] = useState(
        {
            id:undefined,
            userId: 'test',
            title:undefined,
            body:undefined
        }
    )
    const [open, setOpen] = useState(false);

    const tableColumns = [
        {field: "id", headerName: "ID"},
        {field: "userId", headerName: "UserId"},
        {field: "title", headerName: "Title", width: 300},
        {field: "body", headerName: "Body", width: 550},
    ];
    useEffect( () => {
        getAllPosts().then( (response) => {
            setPosts(response.data)
        })
    }, []);


    const onCellClick = (cellInfo) => {
        const postId = cellInfo.row.id;
        getPostComms(postId)
            .then((postComm) => {
                console.log(postComm)
                setModalData({
                    comm: postComm.data,
                    post: cellInfo.row,
                });
            })
            .catch(() => {
                console.error("Something went wrong");
            });
    };

    const handleClose = (event, reason) => {
        if (reason === 'clickaway') {
            return;
        }

        setOpen(false);
    };

    function handleSubmit() {
        postNewPost(newPost).then(response => {
            console.log(posts)
            const {title, body, id, userId} = response.data
            setPosts([...posts, {
                title, body, userId, id: posts[posts.length - 1].id + 1
            }
            ])
            setOpen(true);
        })
    }

    function handleChange(event) {
        setNewPost({
            ...newPost,
            title: event.target.value,
        })
    }

    function handleChange2(event) {
        setNewPost({
            ...newPost,
            body: event.target.value
        })
    }

    function handleChange3(event) {
        setNewPost({
            ...newPost,
            userId: event.target.value
        })
    }

    return (
        <Box height={"800px"} width={"1100px"} marginTop={"15px"} marginBottom={"15px"}>
            {posts === undefined && <div>There is no post yet</div>}
            {posts && (
                <Box height={"800px"} width={"1100px"}>
                    <DataGrid onCellClick={onCellClick} rows={posts} columns={tableColumns}/>
                </Box>
            )}
            {modalData && <UserModal modalData={modalData} onClose={() => setModalData(undefined)}/>}
            <Box marginTop={"30px"}>
                <form onSubmit={(e) => e.preventDefault()}>
                        <label marginBottom={"30px"}>
                            Title:
                            <input type="text" name="title" onChange={handleChange}/>
                        </label>
                        <label marginBottom={"30px"}>
                            Body:
                            <input type="text" name="body" onChange={handleChange2}/>
                        </label>
                        <label marginBottom={"30px"}>
                            UserId:
                            <input type="text" name="body" onChange={handleChange3}/>
                        </label>
                        <button onClick={handleSubmit}>Add</button>
                </form>
            </Box>
            <Snackbar open={open} autoHideDuration={6000} onClose={handleClose}>
                <Alert onClose={handleClose} severity="success" sx={{ width: '100%' }}>
                    Postarea a fost adaugata in lista!
                </Alert>
            </Snackbar>
        </Box>
    );

};

export default PostsComponent;