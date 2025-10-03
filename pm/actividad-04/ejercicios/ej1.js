import { StyleSheet, View } from "react-native";
import { useState } from 'react';

export default function App() {
  const [figure, setFigure] = useState([
    { color: 'blue', height: 100, width: 100 },
    { color: 'red', height: 200, width: 200 }
  ]);

  return (
    <View style={styles.container}>
      <View style={{ flexDirection: 'column'}}>
        {figure.map((elem, index) => (
          <View key={index} width={elem.width} height={elem.height} style={{ backgroundColor: elem.color, alignSelf: 'center' }}></View>
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