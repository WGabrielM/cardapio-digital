import "./card.css";

interface CardProps {
    price: number,
    title: string,
    image: string
}

export default function Card({price, title, image} : CardProps) {
  return (
    <div className="card">
        <img src={image} alt="" />
        <h2>{title}</h2>
        <p><b>Value:</b>{price}</p>
    </div>
  )
}
