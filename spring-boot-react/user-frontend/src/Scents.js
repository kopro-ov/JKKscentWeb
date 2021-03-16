import React, { useState, useEffect } from 'react';
import axios from 'axios';

//https://react.vlpt.us/integrate-api/01-basic.html
function Scents() {
  const [scents, setScents] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchScents = async () => {
      try {
        // 요청이 시작 할 때에는 error 와 users 를 초기화하고
        setError(null);
        setScents(null);
        // loading 상태를 true 로 바꿉니다.
        setLoading(true);
        const response = await axios.get(
          'http://192.168.0.167:1202/scent'
        );
        setScents(response.data); // 데이터는 response.data 안에 들어있습니다.
      } catch (e) {
        console.log(e);
        setError(e);
      }
      setLoading(false);
    };

    fetchScents();
  }, []);

  if (loading) return <div>로딩중..</div>;
  if (error) return <div>에러가 발생했습니다</div>;
  if (!scents) return null;
  return (
    <ul>
      {scents.map(scent => (
        <li key={scent.id}>
          <img src={`http://192.168.0.167:1202/${scent.thumbnailFilename}`} />
          {scent.name} ({scent.id}) {scent.thumbnailFilename}
        </li>
      ))}
    </ul>
  );

}

export default Scents;