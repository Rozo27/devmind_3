import axios from "axios";

const BASE_API = "https://api.github.com/users/";
const POSTS_BASE_API = "https://jsonplaceholder.typicode.com/";

export const getReposInfoForUser = (userLogin) => axios.get(`${BASE_API}${userLogin}`);

export const getAllReposForUser = (userLogin) =>
    axios.get(`${BASE_API}${userLogin}/repos`);

export const getAllPosts = () => axios.get(`${POSTS_BASE_API}posts`);

export const getPostComms = (id) => axios.get(`${POSTS_BASE_API}comments?postId=${id}`);

export const postNewPost = (post) => axios.post(`${POSTS_BASE_API}posts`, post);

