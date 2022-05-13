import './BooksTable.css';
import React from 'react';
import Modal from '@mui/material/Modal';
import {Box} from "@mui/material";

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
const BooksTable = ({bookInfo}) => {

    const [open, setOpen] = React.useState(false);
    const [imgSrc, setImgSrc] = React.useState('');
    const [text, setText] = React.useState('');

    let rowColor = "";

    return (
        <div>
            <table>
                <tr>
                    <th>ID</th>
                    <th>TITLE</th>
                    <th>AUTHOR</th>
                    <th>GENRE</th>
                    <th style={{width:"800px"}}>DESCRIPTION</th>
                </tr>
                {bookInfo.map( (info) => {
                    if(info.id%2 ===0)
                        rowColor = "#f5ea98";
                    else rowColor = "#edaa7e";
                    return (
                            <tr onClick={() => {
                                console.log(info.image);
                                setImgSrc(info.image);
                                setText(info.description);
                                setOpen(true);
                            }} className="rows" style={{backgroundColor:rowColor}}>
                                <td>{info.id}</td>
                                <td>{info.title}</td>
                                <td>{info.author}</td>
                                <td>{info.genre}</td>
                                <td>{info.description}</td>
                            </tr>
                    )
                })}
            </table>
            <Modal
                open={open}
                onClose={() => setOpen(false)}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box sx={style}>
                    <img src={imgSrc}/>
                    <p>{text}</p>
                </Box>

            </Modal>
        </div>
    );
};

export default BooksTable;
