import { useState } from "react";
import { useFoodData } from "./hooks/useFoodData";
import "./App.css";

import Card from "./components/Card";
import { CreateModal } from "./components/Create-Modal";

function App() {
  const { data } = useFoodData();
  const [isModalOpen, setIsModalOpen] = useState(false);

  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }

  return (
    <div className="container">
      <h1>Digital Menu</h1>
      <div className="card-grid">
        {data?.map((foodData) => (
          <Card
            price={foodData.price}
            title={foodData.title}
            image={foodData.image}
          />
        ))}
      </div>
      {isModalOpen && <CreateModal closeModal={handleOpenModal}/>}
      <button onClick={handleOpenModal}>new</button>
    </div>
  );
}

export default App;
