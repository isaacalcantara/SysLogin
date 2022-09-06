import FormLogin from "./components/FormLogin";
import FormRegister from "./components/FormRegister";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import './style.css';

function App() {

  return (
    <div className="container">
        <div className="container-login">
          <Router>
            <Routes>
              <Route path="/" element={<FormLogin />} />
              <Route path="/register" element={<FormRegister />} />
            </Routes>
          </Router>
        </div>
    </div>
  );
}

export default App;
