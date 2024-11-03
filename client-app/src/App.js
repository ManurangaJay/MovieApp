import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react'; 

function App() {
  const [movies, setMovies] = useState();

  const getMovies = async () => {

    try {
      
      const response = await api.get("http://localhost:8080/movies/all");
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

    </div>
  );
}

export default App;
