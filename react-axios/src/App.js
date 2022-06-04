import logo from './logo.svg';
import './App.css';
import {Routes, Route} from "react-router-dom";
import HomeComponent from "./HomeComponent";
import ReposComponent from "./ReposComponent";
import RepositoryDetails from "./RepositoryDetails";
import NavBar from "./NavBar";
import {useEffect, useState} from "react";
import {getAllReposForUser, getReposInfoForUser} from "./ReposApi";
import PostsComponent from "./PostsComponent";

function App() {
  const [data, setData] = useState([]);
  const [repoData, setRepoData] =useState([]);


  return (
    <div id="container">
      <NavBar />
      <Routes>
        <Route path="/home" element={<HomeComponent/>}/>
        <Route path="/" element={<HomeComponent/>}/>
        <Route path="/repos" element={<ReposComponent/>}/>
        <Route path="/repos/:id" element={<RepositoryDetails/>}/>
        <Route path="/posts" element={<PostsComponent/>}/>
      </Routes>
    </div>
  );
}

export default App;