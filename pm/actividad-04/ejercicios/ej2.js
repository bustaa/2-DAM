import { StyleSheet, View } from "react-native";
import { useState } from 'react';

export default function App() {
  const [figure, setFigure] = useState([
    { color: 'blue', height: 150, width: 150 },
    { color: 'blue', height: 150, width: 150 },
    { color: 'red', height: 150, width: 150 },
    { color: 'blue', height: 150, width: 150 },
    { color: 'red', height: 150, width: 150 },
    { color: 'red', height: 150, width: 150 }
  ]);

  return (
    <View style={styles.container}>
      <View style={{ flexDirection: 'row',  flexWrap: 'wrap', justifyContent: 'center'}}>
        {figure.map((elem, index) => (
          <View key={index} width={elem.width} height={elem.height} style={{ backgroundColor: elem.color}}></View>
        ))}  
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  }
})