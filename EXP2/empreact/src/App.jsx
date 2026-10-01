import{useState} from 'react';
function App(){
  const [data, setData] = useState(null);
  useEffect(() => {},[]);
  return(
    <div>
      Welcome to SpringBoot with React
      {
        data &&(
          <div>
            <p>Eno is:{data.eno}</p>
            <p>Name is:{data.name}</p>
          </div>
        )
      }
    </div>
  );
}
export default App;