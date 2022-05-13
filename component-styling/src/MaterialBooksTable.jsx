import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import './MaterialBooksTable.css';
import React from 'react';
import {Box} from "@mui/material";
import Modal from "@mui/material/Modal";
import Button from '@mui/material/Button';


const style = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 500,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 24,
    p: 4,
};


const MaterialBooksTable = ({bookInfo}) => {
    const [open, setOpen] = React.useState(false);
    const [imgSrc, setImgSrc] = React.useState('');
    const [inBooksInfo, setInBooksInfo] = React.useState(bookInfo);


    return (
        <div>
            <TableContainer component={Paper}>
                <Table sx={{ minWidth: 650}} aria-label="simple table">
                    <TableHead>
                        <TableRow sx={{
                            justifyContent:"center",
                            alignItems:"center",
                            width: 400
                        }}>
                            <TableCell>ID</TableCell>
                            <TableCell>TITLE</TableCell>
                            <TableCell>AUTHOR</TableCell>
                            <TableCell>GENRE</TableCell>
                            <TableCell>DESCRIPTION</TableCell>
                            <TableCell>ACTION</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {inBooksInfo.map((info) => {
                            return (
                                <TableRow sx={{
                                    justifyContent:"center",
                                    alignItems:"center",
                                    width: 400,
                                    backgroundColor: info.id%2===0?"#f5ea98":"#edaa7e"
                                }} onClick={() => {
                                    console.log(info.image);
                                    setImgSrc(info.image);
                                    setOpen(true);
                                }}
                                    key={info.id}
                                >
                                    <TableCell>{info.id}</TableCell>
                                    <TableCell>{info.title}</TableCell>
                                    <TableCell>{info.author}</TableCell>
                                    <TableCell>{info.genre}</TableCell>
                                    <TableCell>{info.description}</TableCell>
                                    <TableCell>
                                        <Button sx={{
                                            backgroundColor: info.id%2===0?"#edaa7e":"#f5ea98"
                                        }} variant="contained" onClick={() => {
                                            console.log(info.id)
                                            setInBooksInfo(
                                                inBooksInfo.filter((inBookInfo) => inBookInfo.id !== info.id)
                                            );
                                            console.log(inBooksInfo);
                                        }}>Delete Row</Button>
                                    </TableCell>
                                </TableRow>
                            );
                        })}
                    </TableBody>
                </Table>
            </TableContainer>
            <Modal
                open={open}
                onClose={() => setOpen(false)}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box sx={style}>
                    <img src={imgSrc}/>
                </Box>

            </Modal>
        </div>

    );
};

export default MaterialBooksTable;