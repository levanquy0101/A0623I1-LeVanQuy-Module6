import axios from "axios";

export const get = async (id,item) => {
    try {
        const temp = await axios.get(`http://localhost:8080/api/manager/${id}`);
        return temp.data;
    } catch (e) {
        console.log(e)
        throw new Error("Không thể lấy thông tin của Manager!")
    }
}
