import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react'; 
import { Route, Routes } from 'react-router-dom';
import Layout from './components/Layout';
import Home from './components/home/Home';

function App() {
  const [movies, setMovies] = useState();

  const getMovies = async () => {

    try {
      
      const response = await api.get("http://localhost:8080/movies");
      console.log(response.data); 
      setMovies(response.data);
    
    }catch(e){
      console.log(e); 
    }

  }

  useEffect(() => {
    getMovies();
  }, []);

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Layout/>}>
          <Route path="/" element={<Home movies={movies} />}></Route>
        </Route>
      </Routes>

    </div>
  );
}

export default App;
